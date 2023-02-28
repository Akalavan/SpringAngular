package ru.akalavan.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.akalavan.server.model.enumeration.Status;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 * Class Server
 *
 * @author Вагин Михаил
 * @since 28.02.2023
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAddress;
    private String name;
    private String memory;
    private String imageUrl;
    private Status status;
}
