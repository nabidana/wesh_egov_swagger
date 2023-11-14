package BackEnd.Media.DAO;

import BackEnd.Media.Domain.Media;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("mediaMapper")
public interface MediaDAO {
    Media selectMediaByBoard(Long id);
}
