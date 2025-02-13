package com.jpfuentealba.reportms.controllers;

import com.jpfuentealba.reportms.models.Company;
import com.jpfuentealba.reportms.services.ReportService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "report")
@AllArgsConstructor
public class ReportController {
    private final ReportService reportService;

    @GetMapping(path = "{name}")
    public ResponseEntity<Map<String, String>> getReport(@PathVariable String name){
        var response = Map.of("report", this.reportService.makeReport(name));
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<String> postReport(@RequestBody String report){
        var response = this.reportService.saveReport(report);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(path = "{name}")
    public ResponseEntity<String> deleteReport(@PathVariable String name){
        this.reportService.deleteReport(name);
        return ResponseEntity.noContent().build();
    }
}
