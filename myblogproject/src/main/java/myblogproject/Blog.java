package myblogproject;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "blog")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "basliq")
    @Basic(optional = false)
    private String basliq;

    @Column(name = "meqale")
    @Basic(optional = false)
    private String meqale;

    @Column(name = "tarix")
    @Basic(optional = false)
    private String tarix;


}
