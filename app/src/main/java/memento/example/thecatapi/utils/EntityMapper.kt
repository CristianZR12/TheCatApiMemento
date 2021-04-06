package memento.example.thecatapi.utils

interface EntityMapper <Entity, DomainObject> {
    fun mapFromEntity(entity:Entity):DomainObject
    fun mapToEntity(domainObject: DomainObject):Entity
}