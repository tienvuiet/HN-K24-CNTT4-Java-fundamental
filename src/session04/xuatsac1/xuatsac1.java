package session04.xuatsac1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class xuatsac1 {
    static void main(String[] args) {
        String logs = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";

        Pattern pattern = Pattern.compile("(\\d{4}-\\d{2}-\\d{2}) \\| User: ([^|]+) \\| Action: (BORROW|RETURN) \\| BookID: ([A-Z0-9]+)");
        Matcher matcher = pattern.matcher(logs);
        if(matcher.find()){
            String date = matcher.group(1);
            String user = matcher.group(2);
            String action = matcher.group(3);
            String bookId = matcher.group(4);

            System.out.printf("Ngay: %s\n", date);
            System.out.printf("User: %s\n", user);
            System.out.printf("Action: %s\n", action);
            System.out.printf("BookID: %s\n", bookId);
        }
    }
}
