package br.com.ciadasbolsas.CiaDasBolsas.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_cards")
@SequenceGenerator(name = Card.SEQUENCE_NAME, sequenceName = Card.SEQUENCE_NAME, allocationSize = 1)
public class Card {

    public static final String SEQUENCE_NAME = "seq_tb_cards";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME)
    @Column(name = "card_id", nullable = false)
    private Long id;

    @Column(name = "card_name", nullable = false, unique = true)
    private String name;

    @Column(name = "card_expirate_day", nullable = false)
    private Integer expirateDay;

    @Column(name = "card_enabled", nullable = false)
    private Boolean isEnabled;

    @Column(name = "card_created_at", nullable = false)
    private Date createdAt;

    @Column(name = "card_updated_at")
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "card_bran_id", nullable = false)
    private Brand brand;

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

    public Integer getExpirateDay() {
        return expirateDay;
    }

    public void setExpirateDay(Integer expirateDay) {
        this.expirateDay = expirateDay;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expirateDay=" + expirateDay +
                ", isEnabled=" + isEnabled +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", brand=" + brand +
                '}';
    }
}
