package co.edu.unbosque.sophyfarm.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import co.edu.unbosque.sophyfarm.repository.ReportRepository;

@Service
public class ReportService {

    private final ReportRepository repo;

    public ReportService(ReportRepository repo) {
        this.repo = repo;
    }

    public List<Map<String, Object>> getTopSelling(String period) {
        // period será tipo "2025-11"
        try {
            String[] parts = period.split("-");
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);

            LocalDate start = LocalDate.of(year, month, 1);
            LocalDate end = start.withDayOfMonth(start.lengthOfMonth());

            List<Object[]> raw = repo.findTopSelling(start, end);

            return raw.stream().map(row -> {
                Map<String, Object> map = new HashMap<>();
                map.put("codigoElemento", row[0]);
                map.put("cantidadVendida", row[1]);
                return map;
            }).toList();

            } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                "Formato inválido de periodo. Usa formato YYYY-MM (ejemplo: 2025-11)"
            );
        }

    }
}

