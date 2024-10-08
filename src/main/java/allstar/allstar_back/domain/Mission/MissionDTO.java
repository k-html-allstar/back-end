package allstar.allstar_back.domain.Mission;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MissionDTO {
    private String missionLevel;
    private String missionName;
    private String s3url;
}
