package br.com.ciadasbolsas.CiaDasBolsas.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_brands")
@SequenceGenerator(
        name = Brand.SEQUENCE_NAME,
        sequenceName = Brand.SEQUENCE_NAME,
        allocationSize = 1)
public class Brand implements Serializable {

    public static final String SEQUENCE_NAME = "seq_tb_brands";

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = SEQUENCE_NAME)
    @Column(name = "bran_id", nullable = false)
    private Long id;

    @Column(name = "bran_name", length = 50, nullable = false)
    private String name;

    @Column(name = "bran_image")
    private String image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Brand() {
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
