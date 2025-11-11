package co.edu.unbosque.sophyfarm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.unbosque.sophyfarm.model.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {

    @Query("""
    SELECT r.codigoElemento, SUM(r.cantidad)
    FROM Report r
    WHERE r.fechaVenta BETWEEN :start AND :end
    GROUP BY r.codigoElemento
    ORDER BY SUM(r.cantidad) DESC
    """)
    List<Object[]> findTopSelling(LocalDate start, LocalDate end);
}
