import React, { Component } from 'react';
import '../../App.css';
import { Link } from 'react-router-dom';
import { Button, Container } from 'reactstrap';
import Header from './Header'

class Home extends Component {
  render() {
    return (
      <div>
       <Header />
        <Container fluid>
        <Button color="link"><Link to="/jobs">Recruiter</Link></Button>
        <Button color="link"><Link to="/jobs">Developer</Link></Button>
        </Container>
      </div>
    );
  }
}

export default Home;