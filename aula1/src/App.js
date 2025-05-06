import logo from './aladdin.jpg'
import {useState} from 'react';
import './App.css';

function App() {
  const [usuario, setUsuario] = useState('');
  const [usuarios, setUsuarios] = useState(['Maria', 'Lucas', 'José']);

  const adicionarUSuario = () => {
      //Verificando se novo usuario já existe na lista
    if (usuarios.includes(usuario)) {
      alert('Usuario já existe na lista');
      return;
    }

    // Adicionar novo usauario na lista, mantendo os anteriores
    setUsuarios([...usuarios, usuario]);
    // Limpar campo de entrada0
    setUsuario('');
  }

  return (
    <div className='App'>
      <img src={logo} className='jasmine' alt="logo"/>
      <hr/>
      <h2>Adicionar usuarios</h2>
      <input
        type='text'
        placeholder='Digite o nome do usuario'
        value={usuario}
        onChange={e => setUsuario(e.target.value)}
      />
      
      <button onClick={adicionarUSuario}>Adicionar</button>
      <hr/>
      <h2>Lista de usuarios</h2>
      <ol>{usuarios.map((usuario, index) => (
          <li key={index}>{usuario}</li>
        ))}
      </ol>


    </div>
  );
}

export default App;