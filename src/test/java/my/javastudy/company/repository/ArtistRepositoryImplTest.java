package my.javastudy.company.repository;

import my.javastudy.company.domain.Artist;
import my.javastudy.company.domain.GirlGroup;
import my.javastudy.company.domain.Solo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtistRepositoryImplTest {

    @Test
    void 아티스트추가(){
        Artist boa = new Solo("보아");

        ArtistRepository artistRepository = new ArtistRepositoryImpl();
        artistRepository.addArtist(boa);

        Artist snsd = new GirlGroup("소녀시대");
        artistRepository.addArtist(snsd);

        assertEquals(artistRepository.findAll().size(), 2);
    }

}