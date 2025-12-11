@RestController
@RequestMapping("/api")
public class RealTimeController {

    @GetMapping("/time")
    public Map<String, Object> getCurrentTime() {
        Map<String, Object> map = new HashMap<>();
        map.put("timestamp", System.currentTimeMillis());
        return map;
    }
}
