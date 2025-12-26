package br.com.dio.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString // Equivalent to Lombok's `@Data` (generates `@Getter`, `@Setter` for non-final fields, `@EqualsAndHashCode`, `@ToString` and `@RequiredArgsConstructor`).


public class UserModel {
    private int code;
    private String userName;
    private LocalDate birthday;
}
