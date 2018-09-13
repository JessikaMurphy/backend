package hello.whatever.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import hello.whatever.beans.Paint;
import hello.whatever.beans.PaintService;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowCredentials= "false")
@RequestMapping(value = "/rest/paint")
class PaintController {

	@Autowired PaintService paintService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Paint> getAllPaints() {
		return paintService.getAll();
	}
	@RequestMapping(value = "/search/{searchTerm}", method = RequestMethod.GET)
	public List<Paint> search(@PathVariable String searchTerm){
		return paintService.search(searchTerm);
	}
	
	

	

	
	
	/*@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Paint addPaint(
			@RequestParam(value = "paintName") String paintName,
			@RequestParam(value = "rgb", defaultValue = "unknown") String rgb,
			@RequestParam(value = "paintId", defaultValue = "unknown") String paintId,
			@RequestParam(value = "brand", defaultValue = "unknown") String brand
			) {

		Paint paint = new Paint(paintName, rgb, paintId, brand);
		WhateverApplication.hmPaint.put(new Long(paint.getId()), paint);
		return paint;
	}*/

}
