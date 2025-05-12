// src\components\UserList\styles.css

import './styles.css'

const UserList = ({ usuarios }) => {
    return (
        <div className='user-list'>
            <h2>Lista de usuarios</h2>
            <ol>
                {usuarios.map((usuarios, index) => (
                    <li key={index}>{usuarios}</li>
                ))}
            </ol>
        </div>
    )
}

export default UserList