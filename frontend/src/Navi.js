import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container, Navbar, Nav } from 'react-bootstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faPaw } from '@fortawesome/free-solid-svg-icons';


export default class src extends Component {
  render() {
    return (
      <header>
        <Navbar variant="dark" bg="success" expand="md"> 
          <Container>
            <Navbar.Brand href="#">
              <FontAwesomeIcon icon={faPaw} size="2x"/><span className="ml-3">PetBrasil</span>
            </Navbar.Brand>
            <Navbar.Toggle aria-controls="petbrasil-navbar" />
            <Navbar.Collapse id="petbrasil-navbar">
              <Nav className="ml-auto">
                <Nav.Link href="#Vagas">Vagas</Nav.Link>
                <Nav.Link href="#Candidatos">Candidatos</Nav.Link>
              </Nav>
            </Navbar.Collapse>
          </Container>
        </Navbar>
      </header>
    );
  }
}