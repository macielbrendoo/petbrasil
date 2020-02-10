import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Container, Navbar, Nav, NavDropdown, Button } from 'react-bootstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faPaw, faSignInAlt } from '@fortawesome/free-solid-svg-icons';


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
                {/*
                <NavDropdown title="Negócios e Oportunidades" id="no-dropdown">
                  <NavDropdown.Item href="#empresas">Empresas</NavDropdown.Item>
                  <NavDropdown.Item href="#equipamentos">Equipamentos</NavDropdown.Item>
                  <NavDropdown.Item href="#servicos">Serviços</NavDropdown.Item>
                </NavDropdown>
                */}
                <NavDropdown title="Vagas" id="vagas-dropdown">
                  <NavDropdown.Item href="#vaga-banhista">Banhista</NavDropdown.Item>
                  <NavDropdown.Item href="#vaga-tosador">Tosador</NavDropdown.Item>
                  <NavDropdown.Item href="#vaga-veterinario">Veterinário</NavDropdown.Item>
                  <NavDropdown.Item href="#vaga-comercio">Comércio / Vendas</NavDropdown.Item>
                  <NavDropdown.Item href="#vaga-administracao">Administração</NavDropdown.Item>
                  <NavDropdown.Item href="#vaga-canil">Canil / Passeador / Hotel</NavDropdown.Item>
                  <NavDropdown.Item href="#vaga-motorista">Motorista</NavDropdown.Item>
                </NavDropdown>
                <NavDropdown title="Candidatos" id="candidatos-dropdown">
                  <NavDropdown.Item href="#candidato-banhista">Banhista</NavDropdown.Item>
                  <NavDropdown.Item href="#candidato-tosador">Tosador</NavDropdown.Item>
                  <NavDropdown.Item href="#candidato-veterinario">Veterinário</NavDropdown.Item>
                  <NavDropdown.Item href="#candidato-comercio">Comércio / Vendas</NavDropdown.Item>
                  <NavDropdown.Item href="#candidato-administracao">Administração</NavDropdown.Item>
                  <NavDropdown.Item href="#candidato-canil">Canil / Passeador / Hotel</NavDropdown.Item>
                  <NavDropdown.Item href="#candidato-motorista">Motorista</NavDropdown.Item>
                </NavDropdown>
                {/*
                <Nav.Link href="#cursos">Cursos</Nav.Link>
                <Nav.Link href="#vendas">Vendas</Nav.Link>
                <Nav.Link href="#doacao">Doação</Nav.Link>
                */}
                <Nav.Item><Button variant="outline-light">Entrar <FontAwesomeIcon icon={faSignInAlt}></FontAwesomeIcon></Button></Nav.Item>
              </Nav>
            </Navbar.Collapse>
          </Container>
        </Navbar>
      </header>
    );
  }
}