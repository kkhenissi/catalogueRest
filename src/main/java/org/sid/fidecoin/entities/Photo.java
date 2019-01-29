package org.sid.fidecoin.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Photo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PHOTO")
    private Long idPhoto;
    private String urlPhoto;
    @ManyToOne
    @JoinColumn(name = "ID_item")
    private Item item;

    public Photo(String kkkkkkkkk) {
    }
}
