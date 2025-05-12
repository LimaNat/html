// src\App.js

import { useState } from 'react';
import logo from './assets/images/logoSenai.png'
import UserInput from './components/UserInput'
import UserList from './components/UserList';
import './App.css';

function App() {

  const [usuarios, setUsuarios] = useState(['Marta', 'Maria', 'José'])

  const adicionarUsuarios = (novoUsuario) => {
    if (usuarios.includes(novoUsuario)) {
      alert('Usuario já existe na lista')
      return;
    }
    setUsuarios([...usuarios, novoUsuario])
  }

  return (
    <div className='App'>
      <img src = {logo} alt='logo da empresa'/>
      <h1>Meu App</h1>
      <hr/>
      <UserInput onAddUser={adicionarUsuarios}/>
      <hr/>
      <UserList usuarios={usuarios}></UserList>
    </div>
  );
}

export default App;
