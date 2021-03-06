package disparse.discord.jda;

import disparse.discord.AbstractDiscordResponse;
import net.dv8tion.jda.api.EmbedBuilder;

public class DiscordResponse extends AbstractDiscordResponse<EmbedBuilder> {

  public DiscordResponse() {
    super();
  }

  public DiscordResponse(String message) {
    super(message);
  }

  public DiscordResponse(EmbedBuilder builder) {
    super(builder);
  }

  public static DiscordResponse of(String fmt, Object... args) {
    return new DiscordResponse(String.format(fmt, args));
  }

  public static DiscordResponse of(EmbedBuilder builder) {
    return new DiscordResponse(builder);
  }

  public static DiscordResponse noop() {
    return new DiscordResponse();
  }
}
