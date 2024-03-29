package com.rader.algafood.api.model.input;

import com.rader.algafood.core.validation.FileContentType;
import com.rader.algafood.core.validation.FileSize;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.MediaType;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class FotoProdutoInput {

    //@ApiModelProperty(value = "Arquivo da foto do produto (máximo 500KB, apenas JPG e PNG)",
           // required = true)
    @NotNull
    @FileSize(max = "500KB")
    @FileContentType(allowed = { MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE })
    private MultipartFile arquivo;

    //@ApiModelProperty(value = "Descrição da foto do produto", required = true)
    @NotBlank
    private String descricao;
}
