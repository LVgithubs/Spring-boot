package site.level.march_test.hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // PK - id

    // 주소

    private String addr;
    private String mgtStaDd;
    private String pcrPsblYn;
    private String ratPsblYn;
    private String recuClCd;

    private String sgguCdNm;

    private String sidoCdNm;

    private String yadmNm;
    private String ykihoEnc;
    private String xposWgs84;
    private String yposWgs84;

    private String xpos;
    private String ypos;
}
