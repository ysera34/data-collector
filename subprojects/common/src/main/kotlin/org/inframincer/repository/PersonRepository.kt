package org.inframincer.repository

import org.inframincer.model.Person
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface PersonRepository : MongoRepository<Person, String> {
    fun findAllByLastName(@Param(value = "name") name: String): List<Person>
}
