class LogLineParser
  def initialize(line)
    match = line.match('\[(\w+)\]:(.*)')
    @message = match.captures.last.gsub(/[^a-zA-Z ]/, '').strip
    @log_level = match.captures.first.downcase
  end

  def message
    return @message
  end

  def log_level
    return @log_level
  end

  def reformat
    return "#{@message} (#{@log_level})"
  end
end
