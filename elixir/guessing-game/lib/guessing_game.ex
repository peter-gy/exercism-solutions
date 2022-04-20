defmodule GuessingGame do
  def compare(secret_number, guess \\ nil)

  def compare(secret_number, guess) when is_integer(guess) do
    diff = secret_number - guess

    cond do
      diff == 0 -> "Correct"
      abs(diff) == 1 -> "So close"
      diff < 0 -> "Too high"
      true -> "Too low"
    end
  end

  def compare(_secret_number, guess) when not is_integer(guess) do
    "Make a guess"
  end
end
