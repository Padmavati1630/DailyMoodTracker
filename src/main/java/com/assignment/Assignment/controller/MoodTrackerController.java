package com.assignment.Assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.assignment.Assignment.entity.Mood_tracker;
import com.assignment.Assignment.repository.TrackerRepository;

@Controller
public class MoodTrackerController {

	@Autowired
	TrackerRepository repository;

	@GetMapping("/")
	public String loadMain() {
		return "main.html";
	}

	@GetMapping("/insert")
	public String loadInsertForm() {
		return "insert.html";
	}

	@PostMapping("/insert")
	public String saveRecord(Mood_tracker tracker, ModelMap map) {
		repository.save(tracker);
		map.put("message", "Movie Added Success");
		return "main.html";
	}

	@GetMapping("/fetch")
	public String fetch(ModelMap map) {
		List<Mood_tracker> trackers = repository.findAll();
		if (trackers.isEmpty()) {
			map.put("message", "No Records Present");
			return "main.html";
		}
		map.put("mood", trackers);
		return "fetch.html";
	}
	@GetMapping("/delete")
	public String removeById(@RequestParam Long id, ModelMap map) {
		  repository.deleteById(id);
		  map.put("message", "record deleted");
		  return fetch(map);
	}
	@GetMapping("/update")
	public String getUpdateForm(@RequestParam Long id,ModelMap model) {
		Optional<Mood_tracker> o=repository.findById(id);
		model.put("tracker", o.get());
		return "update.html";
	}
	@PostMapping("/update")
	public String update(@ModelAttribute Mood_tracker tracker) {
		repository.save(tracker);
		return "redirect:/fetch";
	}
}
