package gr.aueb.cf.libapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "myBooks")
public class MyBookList {

    @Id
    private Integer id;
    private String name;
    private String author;
    private Integer price;
}
