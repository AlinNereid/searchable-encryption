package dao.fhe;

import dto.Params;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "\"fhe_parameters\"")
@NamedQueries({
    @NamedQuery(name = FHEParameters.FIND_ALL, query = "SELECT fp FROM FHEParameters fp")
})
public class FHEParameters implements Params, Serializable {

    public static final String FIND_ALL = "FHEParameters.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "fhe_parameters_id_seq", sequenceName = "fhe_parameters_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "secret_key")
    @Basic(optional = false)
    private String secretKey;

    @Column(name = "public_key")
    @Basic(optional = false)
    private String publicKey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
