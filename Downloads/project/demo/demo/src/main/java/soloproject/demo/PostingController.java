package soloproject.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/postings", produces = MediaType.APPLICATION_JSON_VALUE)
public class PostingController {

    @PostMapping
    public String postPosting(@RequestParam("memberId") long memberId,
                              @RequestParam("postingId") String postingId) {
        System.out.println("# memberId = " + memberId);
        System.out.println("# postingId = " + postingId);

        String response =
                "{\"" +
                        "memberId\":\""+memberId+"\","+
                        "\"postingId\":\""+postingId+"\","+
                        "}";
        return response;
    }

    @GetMapping("/{posting-id")
    public String getPosting(@PathVariable("posting-id")long postingId) {
        System.out.println("# postingId = " + postingId);
        //not implementation
        return null;
    }

    @GetMapping
    public String getPostings() {
        System.out.println("# get Postings");

        //not implementation
        return null;
    }

}
