package br.com.dio.mapper;

import br.com.dio.dto.UserDTO;
import br.com.dio.model.UserModel;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-18T19:04:17-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.jar, environment: Java 21.0.8 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserModel toModel(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setCode( dto.getId() );
        userModel.setUserName( dto.getName() );
        userModel.setBirthday( dto.getBirthday() );

        return userModel;
    }

    @Override
    public UserDTO toDTO(UserModel model) {
        if ( model == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( model.getCode() );
        userDTO.setName( model.getUserName() );
        userDTO.setBirthday( model.getBirthday() );

        return userDTO;
    }
}
