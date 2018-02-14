package pkgCore;

import java.util.Scanner;

public class CBaseballCalculator
{
	Scanner input = new Scanner(System.in);
	
	private int m_iAb;
	private int m_iHits;
	private int m_iSingles;
	private int m_iDoubles;
	private int m_iTriples;
	private int m_iHomeRuns;
	private int m_iRuns;
	private int m_iWalks;
	private int m_iSacFly;
	private int m_iHitsByPitch;
	
	public CBaseballCalculator()
	{
		// Get user input for the values necessary for use
		System.out.println("At bats: ");
		this.m_iAb = input.nextInt();
		
		System.out.println("Hits: ");
		this.m_iHits = input.nextInt();
		
		System.out.println("Doubles: ");
		this.m_iDoubles = input.nextInt();
		
		System.out.println("Triples: ");
		this.m_iTriples = input.nextInt();
		
		System.out.println("Home runs: ");
		this.m_iHomeRuns = input.nextInt();
		
		System.out.println("Runs: ");
		this.m_iRuns = input.nextInt();
		
		System.out.println("Walks: ");
		this.m_iWalks = input.nextInt();
		
		System.out.println("Sacrifice flies: ");
		this.m_iSacFly = input.nextInt();
		
		System.out.println("Hits by pitch: ");
		this.m_iHitsByPitch = input.nextInt();
		
		// Calculate singles
		m_iSingles = m_iHits - m_iDoubles - m_iTriples - m_iHomeRuns;
	}
	
	// Methods to calculate stuff for the Quiz
	public double ba()
	{
		return (double)m_iHits / m_iAb;
	}
	
	public double obp()
	{
		return ((double)m_iHits + m_iWalks + m_iHitsByPitch) / (m_iAb + m_iWalks + m_iHitsByPitch + m_iSacFly);
	}
	
	public double slg()
	{
		return (double)this.tb() / m_iAb;
	}
	
	public double obs()
	{
		return this.slg() + this.obp();
	}
	public int tb()
	{
		return (1 * m_iSingles) + (2 * m_iDoubles) + (3 * m_iTriples) + (4 * m_iHomeRuns);
	}
	
	// Getters and Setters
	public int getM_iAb()
	{
		return m_iAb;
	}

	public void setM_iAb(int m_iAb)
	{
		this.m_iAb = m_iAb;
	}

	public int getM_iHits()
	{
		return m_iHits;
	}

	public void setM_iHits(int m_iHits)
	{
		this.m_iHits = m_iHits;
	}

	public int getM_iSingles()
	{
		return m_iSingles;
	}

	public void setM_iSingles(int m_iSingles)
	{
		this.m_iSingles = m_iSingles;
	}

	public int getM_iDoubles()
	{
		return m_iDoubles;
	}

	public void setM_iDoubles(int m_iDoubles)
	{
		this.m_iDoubles = m_iDoubles;
	}

	public int getM_iTriples()
	{
		return m_iTriples;
	}

	public void setM_iTriples(int m_iTriples)
	{
		this.m_iTriples = m_iTriples;
	}

	public int getM_iHomeRuns()
	{
		return m_iHomeRuns;
	}

	public void setM_iHomeRuns(int m_iHomeRuns)
	{
		this.m_iHomeRuns = m_iHomeRuns;
	}

	public int getM_iRuns()
	{
		return m_iRuns;
	}

	public void setM_iRuns(int m_iRuns)
	{
		this.m_iRuns = m_iRuns;
	}

	public int getM_iWalks()
	{
		return m_iWalks;
	}

	public void setM_iWalks(int m_iWalks)
	{
		this.m_iWalks = m_iWalks;
	}

	public int getM_iSacFly()
	{
		return m_iSacFly;
	}

	public void setM_iSacFly(int m_iSacFly)
	{
		this.m_iSacFly = m_iSacFly;
	}

	public int getM_iHitsByPitch()
	{
		return m_iHitsByPitch;
	}

	public void setM_iHitsByPitch(int m_iHitsByPitch)
	{
		this.m_iHitsByPitch = m_iHitsByPitch;
	}
}
