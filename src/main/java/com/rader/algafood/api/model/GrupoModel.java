package com.rader.algafood.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Relation(collectionRelation = "grupos")
@Setter
@Getter
public class GrupoModel extends RepresentationModel<GrupoModel> {

    //@ApiModelProperty(example = "1")
    private Long id;
    //@ApiModelProperty(example = "Gerente")
    private String nome;

}
