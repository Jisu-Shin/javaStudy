package main.company.repository;

import main.company.Artist;
import main.company.GirlGroup;
import main.company.Solo;
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