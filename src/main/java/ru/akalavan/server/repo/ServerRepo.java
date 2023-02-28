package ru.akalavan.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.akalavan.server.model.Server;

/**
 * Class ServerRepo
 *
 * @author Вагин Михаил
 * date 28.02.2023
 */
public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);

}
