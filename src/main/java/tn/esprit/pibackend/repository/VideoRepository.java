package tn.esprit.pibackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pibackend.entity.Video;
import tn.esprit.pibackend.entity.enums.Niveau;
import tn.esprit.pibackend.entity.enums.OptionEnum;
import tn.esprit.pibackend.entity.enums.Visible;
import tn.esprit.pibackend.entity.enums.videoTags;
import tn.esprit.pibackend.entity.enums.Niveau;
import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Long> {
    Video findVideoByVideoId(Long videoId);
    List<Video> findVideoByNiveau(Niveau niveau);
    List<Video> findVideoByVisibility(Visible visibility);
    List<Video> findVideoByOption(OptionEnum option);
    List<Video> findVideoByTags(videoTags tags);
}
