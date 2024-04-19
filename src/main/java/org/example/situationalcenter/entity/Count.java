package org.example.situationalcenter.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@EqualsAndHashCode
public class Count {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "error")
    private String error;

    @ManyToOne
    @JoinColumn(name = "data_id", referencedColumnName = "id", nullable = false, updatable = false, insertable = false)
    private Data data;

}
