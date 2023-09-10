import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VotingController {

    private int candidate1Votes = 0;
    private int candidate2Votes = 0;

    @GetMapping("/")
    public String showVotingForm() {
        return "voting";
    }

    @PostMapping("/vote")
    public String vote(@RequestParam int userAge, @RequestParam int userSelection, Model model) {
        if (userAge >= 18) {
            if (userSelection == 1) {
                candidate1Votes++;
            } else if (userSelection == 2) {
                candidate2Votes++;
            }
            model.addAttribute("message", "Terima Kasih Telah memberikan suara!");
        } else {
            model.addAttribute("message", "Maaf, Anda tidak berhak memilih.");
        }
        model.addAttribute("candidate1Votes", candidate1Votes);
        model.addAttribute("candidate2Votes", candidate2Votes);
        return "voting";
    }
}
