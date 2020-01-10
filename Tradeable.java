import java.math.BigDecimal;

public interface Tradeable {

	public BigDecimal getExchangeRate();
	public BigDecimal getExchangedAmount(BigDecimal amount);
}
