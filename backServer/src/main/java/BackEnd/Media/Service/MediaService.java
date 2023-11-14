package BackEnd.Media.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import BackEnd.Media.DAO.MediaDAO;
import BackEnd.Media.Domain.Media;

@Service("mediaService")
public class MediaService {
    
    @Resource(name = "mediaMapper")
    private MediaDAO mediaDAO;

    public Media getMediaByBoard(String id) throws Exception{
        Long long_id = Long.parseLong(id);
        return mediaDAO.selectMediaByBoard(long_id);
    }
}
