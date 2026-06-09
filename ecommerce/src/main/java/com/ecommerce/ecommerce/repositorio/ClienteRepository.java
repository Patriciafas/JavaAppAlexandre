/*

O padrão do JPA é:

Criamos interfaces para cada modelo em nossa aplicação.
Essas interfaces vão Herdar de JpaRepository e implementar os métodos para o CRUD.

*/

package com.ecommerce.ecommerce.repositorio;

import com.ecommerce.ecommerce.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID>{

}
// JpaRepositoryinterface do Spring Data JPA que fornece operações prontas como SAVE, REMOVE, UP e etc
//  para acessar e manipular dados no banco de dados, sem precisar escrever a maior parte das consultas
//  SQL manualmente.*//