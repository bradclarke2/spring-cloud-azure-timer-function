package example;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.TimerTrigger;

import java.time.LocalDateTime;

public class ScheduleHandler {

	@FunctionName("promotionSyncTrigger")
	public void run(
		@TimerTrigger(name = "timerInfo", schedule = "%PromotionTimerTrigger%") String timerInfo,
		final ExecutionContext context
	) {
		context.getLogger().info("Java Timer trigger function executed at: " + LocalDateTime.now());
	}
}
