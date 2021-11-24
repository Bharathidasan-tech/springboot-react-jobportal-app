import React, {Component} from "react";
import { Link, withRouter} from "react-router-dom";
import { Button, Container,Form, FormGroup, Input, Label} from "reactstrap";
import Header from '../Layout/Header';

class JobAddOrEdit extends Component {

    emptyItem = {
        companyName: '',
        companyURL: '',
        contactEmail: '',
        jobRole: '',
        jobLocation: '',
        jobDescription: '',
        postDate: '',
        closeDate: '',
    };

    constructor(props) {
        super(props);
        this.state = {
            item: this.emptyItem
        };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    async componentDidMount() {
        if (this.props.match.params.id !== 'new') {
            const job = await (await fetch(`/portal/api/v1/jobs/${this.props.match.params.id}`)).json();
            this.setState({item: job});
        }
    }

    handleChange(event) {
        const target = event.target;
        const value = target.value;
        const name = target.name;
        let item = {...this.state.item};
        item[name] = value;
        this.setState({item});
    }

async handleSubmit(event) {
    event.preventDefault();
    const {item} = this.state;

    await fetch('/portal/api/v1/jobs' + (item.id ? '/' + item.id : ''), {
        method: (item.id) ? 'PUT' : 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(item),
    });
    this.props.history.push('/jobs');
}

    render() {
        const {item} = this.state;
        const title = <h2>{item.id ? 'Edit Job Post' : 'Post New Job'}</h2>;

        return <div>
            <Header/>
            <Container>
                {title}
                <Form onSubmit={this.handleSubmit}>
                    <FormGroup>
                        <Label for="companyName">Comany Name</Label>
                        <Input type="text" name="companyName" id="companyName" value={item.companyName || ''}
                               onChange={this.handleChange} autoComplete="companyName"/>
                    </FormGroup>
                    <FormGroup>
                        <Label for="companyURL">URL</Label>
                        <Input type="text" name="companyURL" id="companyURL" value={item.companyURL || ''}
                               onChange={this.handleChange} autoComplete="companyURL"/>
                    </FormGroup>
                    <FormGroup>
                        <Label for="contactEmail">Email</Label>
                        <Input type="text" name="contactEmail" id="contactEmail" value={item.contactEmail || ''}
                               onChange={this.handleChange} autoComplete="contactEmail"/>
                    </FormGroup>
                    <FormGroup>
                        <Label for="jobRole">Job Role</Label>
                        <Input type="text" name="jobRole" id="jobRole" value={item.jobRole || ''}
                               onChange={this.handleChange} autoComplete="jobRole"/>
                    </FormGroup>
                    <FormGroup>
                        <Label for="jobLocation">Job Location</Label>
                        <Input type="text" name="jobLocation" id="jobLocation" value={item.jobLocation || ''}
                               onChange={this.handleChange} autoComplete="jobLocation"/>
                    </FormGroup>
                    <FormGroup>
                        <Label for="jobDescription">Job Description</Label>
                        <Input type="text" name="jobDescription" id="jobDescription" value={item.jobDescription || ''}
                               onChange={this.handleChange} autoComplete="jobDescription"/>
                    </FormGroup>
                    <FormGroup>
                        <Label for="postDate">Posted Date</Label>
                        <Input type="text" name="postDate" id="postDate" value={item.postDate || ''}
                               onChange={this.handleChange} autoComplete="postDate"/>
                    </FormGroup>
                    <FormGroup>
                        <Label for="closeDate">Closing Date</Label>
                        <Input type="text" name="closeDate" id="closeDate" value={item.closeDate || ''}
                               onChange={this.handleChange} autoComplete="closeDate"/>
                    </FormGroup>
                    <FormGroup>
                        <Button color="primary" type="submit">Save</Button>{' '}
                        <Button color="secondary" tag={Link} to="/jobs">Cancel</Button>
                    </FormGroup>
                </Form>
            </Container>
        </div>
    }
}

export default withRouter(JobAddOrEdit);