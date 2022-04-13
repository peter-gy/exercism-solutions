defmodule LanguageList do
  @exciting_item "Elixir"

  def new(), do: []

  def add(list, language), do: [language | list]

  def remove([_ | tail]), do: tail

  def first([head | _]), do: head

  def count(list), do: length(list)

  def exciting_list?(list), do: @exciting_item in list
end
