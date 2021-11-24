
import React, { Component } from 'react';
import { Collapse, Nav, Navbar, NavbarBrand, NavbarToggler, NavItem, NavLink } from 'reactstrap';
import { Link } from 'react-router-dom';

class Header extends Component {
  constructor(props) {
    super(props);
    this.state = {isOpen: false};
    this.toggle = this.toggle.bind(this);
  }

  toggle() {
    this.setState({
      isOpen: !this.state.isOpen
    });
  }

  render() {
    return <Navbar color="dark" dark expand="md">
      <NavbarBrand tag={Link} to="/">Home</NavbarBrand>
      <NavbarToggler onClick={this.toggle}/>
      <Collapse isOpen={this.state.isOpen} navbar>
        <Nav className="d-flex" navbar>
          <NavItem>
            <NavLink target="_blank" rel="noreferrer"
              href="https://github.com/Bharathidasan-tech">Github</NavLink>
          </NavItem>
          <NavItem>
            <NavLink target="_blank" rel="noreferrer" href="https://www.linkedin.com/in/bharathidasan-manickam-72301323/">LinkedIn</NavLink>
          </NavItem>
        </Nav>
      </Collapse>
    </Navbar>;
  }
}

export default Header;