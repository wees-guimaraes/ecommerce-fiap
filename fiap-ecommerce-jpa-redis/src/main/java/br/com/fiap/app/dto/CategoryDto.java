package br.com.fiap.app.dto;

import br.com.fiap.app.domain.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public CategoryDto(Category obj) {
        this.id = obj.getId();
        this.name = obj.getName();
    }

    public Category from(CategoryDto objDto) {
        return new Category(objDto.getId(), objDto.getName());
    }
}
