defmodule Lasagna do
  @expected_minutes_in_oven 40
  @minutes_per_layer 2

  def expected_minutes_in_oven(), do: @expected_minutes_in_oven

  def remaining_minutes_in_oven(mins_in), do: expected_minutes_in_oven() - mins_in

  def preparation_time_in_minutes(num_layers), do: @minutes_per_layer * num_layers

  def total_time_in_minutes(num_layers, mins_in),
    do: preparation_time_in_minutes(num_layers) + mins_in

  def alarm(), do: "Ding!"
end
