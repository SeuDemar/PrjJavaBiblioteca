package com.biblioteca.biblioteca.application;

import com.biblioteca.biblioteca.domain.dto.UsuarioDTO;
import com.biblioteca.biblioteca.domain.entity.Usuario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-25T21:28:49-0300",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class MappersImpl implements Mappers {

    @Override
    public UsuarioDTO UsuariotoDto(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setDataCadastro( usuario.getDataCadastro() );
        usuarioDTO.setEmail( usuario.getEmail() );
        usuarioDTO.setId( usuario.getId() );
        usuarioDTO.setNome( usuario.getNome() );

        return usuarioDTO;
    }

    @Override
    public Usuario UsuarioDTOtoEntity(UsuarioDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        usuario.dataCadastro( usuarioDTO.getDataCadastro() );
        usuario.email( usuarioDTO.getEmail() );
        usuario.nome( usuarioDTO.getNome() );

        return usuario.build();
    }
}
