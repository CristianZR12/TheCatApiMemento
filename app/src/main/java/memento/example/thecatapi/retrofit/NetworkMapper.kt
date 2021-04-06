package memento.example.thecatapi.retrofit

import memento.example.thecatapi.model.BreedsModel
import memento.example.thecatapi.utils.EntityMapper
import javax.inject.Inject

class NetworkMapper
@Inject
constructor():EntityMapper<BreedsModel, BreedsRetrofitNetwork> {
    override fun mapFromEntity(entity: BreedsModel): BreedsRetrofitNetwork {
        return BreedsRetrofitNetwork(
            id = entity.id,
            name = entity.name,
            description = entity.description,
        );
    }

    override fun mapToEntity(domainObject: BreedsRetrofitNetwork): BreedsModel {
        return BreedsModel(
            id = domainObject.id,
            name = domainObject.name,
            description = domainObject.description,
        );
    }

}