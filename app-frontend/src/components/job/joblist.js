import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';
import { Link } from 'react-router-dom';
import Header from '../Layout/Header';

class JobList extends Component {

  constructor(props) {
    super(props);
    this.state = {jobs: [], isLoading: true};
  }

  componentDidMount() {
    this.setState({isLoading: true});

    fetch('/portal/api/v1/jobs')
      .then(response => response.json())
      .then(data => this.setState({jobs: data.joblist, isLoading: false}));
  }

  async remove(id) {
    await fetch(`/portal/api/v1/jobs/${id}`, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    }).then(() => {
        let updatedJobs = [...this.state.jobs].filter(i => i.id !== id);
        this.setState({jobs: updatedJobs});
    });
}

  render() {
    const {jobs, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    const jobList = jobs.map(job => {
      return <tr key={job.id}>
        <td style={{whiteSpace: 'nowrap'}}>{job.companyName}</td>
        <td style={{whiteSpace: 'nowrap'}}> <a href= {job.companyURL} target="_blank" >{job.companyURL}</a></td>
        <td style={{whiteSpace: 'nowrap'}}>{job.contactEmail}</td>
        <td style={{whiteSpace: 'nowrap'}}>{job.jobRole}</td>
        <td style={{whiteSpace: 'nowrap'}}>{job.jobLocation}</td>
        <td style={{whiteSpace: 'nowrap'}}>{job.jobDescription}</td>
        <td style={{whiteSpace: 'nowrap'}}>{job.postDate}</td>  
        <td style={{whiteSpace: 'nowrap'}}>{job.closeDate}</td>
        <td>
          <ButtonGroup>
            <Button size="sm" color="primary" tag={Link} to={"/jobs/" + job.id}>Edit</Button>
            <Button size="sm" color="danger" onClick={() => this.remove(job.id)}>Delete</Button>
          </ButtonGroup>
        </td>
      </tr>
    });

    return (
      <div>
       <Header />
        <Container fluid>
         <div className="float-end">
            <Button   color="success" tag={Link} to="/jobs/new">Post Job</Button>
          </div>
          <Table className="table table-striped table-hover">
            <thead>
            <tr>
              <th width="20%">Comany Name</th>
              <th width="10%">URL</th>
              <th width="10%">Mail</th>
              <th width="20%">Job Role</th>
              <th width="20%">Job Location</th>
              <th width="40%">Job Description</th>
              <th width="20%">Posted Date</th>
              <th width="40%">Closing Date</th>
              <th width="10%">Actions</th>
            </tr>
            </thead>
            <tbody>
            {jobList}
            </tbody>
          </Table>
        </Container>
      </div>
    );
  }
}

export default JobList;