package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Tempo;

public interface TemposRepository extends JpaRepository<Tempo, Long> {

}
