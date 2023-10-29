package me.dbp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import me.dbp.api.entity.CourseAssessmentDetails;
import me.dbp.api.repository.CourseAssessmentDetailsRepository;

import java.util.List;

@RestController
@RequestMapping("/course_assessment_details")
public class GroupController {

    @Autowired
    private CourseAssessmentDetailsRepository courseAssessmentDetailsRepository;

    @GetMapping
    public ResponseEntity<List<CourseAssessmentDetails>> cad() {
        List<CourseAssessmentDetails> cad = courseAssessmentDetailsRepository.findAll();
        return new ResponseEntity<>(cad, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCAD(@PathVariable Long id) {

        if (!courseAssessmentDetailsRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("CAD with ID " + id + " not found");
        }

        CourseAssessmentDetails existingCAS = courseAssessmentDetailsRepository.findById(id).get();
        return new ResponseEntity<>(existingCAS, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> cad(@RequestBody CourseAssessmentDetails cad) {
        courseAssessmentDetailsRepository.save(cad);
        return ResponseEntity.status(201).body("new item created");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCAD(@PathVariable Long id, @RequestBody CourseAssessmentDetails cad) {

        if (!courseAssessmentDetailsRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("CAD with ID " + id + " not found");
        }
        
        cad.setId(id);
        courseAssessmentDetailsRepository.save(cad);
        return ResponseEntity.status(HttpStatus.OK).body("item" + id + "updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCAD(@PathVariable Long id) {

        if (!courseAssessmentDetailsRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("CAD with ID " + id + " not found");
        }
        
        courseAssessmentDetailsRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("item" + id + "deleted");
    }
}
